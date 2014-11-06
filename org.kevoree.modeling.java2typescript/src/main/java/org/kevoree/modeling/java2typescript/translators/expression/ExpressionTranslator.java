package org.kevoree.modeling.java2typescript.translators.expression;

import com.intellij.psi.*;
import org.kevoree.modeling.java2typescript.TranslationContext;

/**
 * Created by duke on 11/6/14.
 */
public class ExpressionTranslator {

    public static void translate(PsiExpression expression, TranslationContext ctx) {
        if (expression instanceof PsiLiteralExpression) {
            LiteralTranslator.translate((PsiLiteralExpression) expression, ctx);
        } else if (expression instanceof PsiNewExpression) {
            NewExpressionTranslator.translate((PsiNewExpression) expression, ctx);
        } else if (expression instanceof PsiBinaryExpression) {
            BinaryExpressionTranslator.translate((PsiBinaryExpression) expression, ctx);
        } else if (expression instanceof PsiReferenceExpression) {
            ReferenceExpressionTranslator.translate((PsiReferenceExpression) expression, ctx);
        } else if (expression instanceof PsiPrefixExpression) {
            PrefixExpressionTranslator.translate((PsiPrefixExpression) expression, ctx);
        } else {
            System.err.println("EXPR " + expression);
        }
    }

}