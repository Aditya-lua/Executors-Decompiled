/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd574..0x9dd790 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dd574_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_9dd574_0;

extern char g_1000000;

char * sub_9dd574(st_9dd574_0 *a0)
{
    unsigned long long v2;  // x20
    char *v3;  // x21
    char *iter;  // x21
    char *v5;  // x21
    unsigned long v6;  // x22
    unsigned long long v7;  // w9
    unsigned long long v8;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9e4828())
    {
        v2 = sub_a6bf4c(2 | a0->field_8 * 16, "crypto/bn/bn_conv.c", 23);
        if (!v2)
            return v2;
        v3 = v2;
        iter = v3;
        if (*(int *)((char *)&a0[1].field_0 + 4))
        {
            v5 = v3;
            *v5 = 45;
            iter = v5 + 1;
        }
        v6 = a0->field_8;
        if ((int)v6 >= 1)
        {
            v7 = 0;
            do
            {
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                if (v7 || v8 > 0xffffffffffffff)
                {
                    iter = &iter[sub_a6e2d0(iter)];
                    v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                }
                else if (v8 <= 0xffffffffffff)
                {
                    if (!1)
                        goto LABEL_9dd6c4;
                    goto LABEL_9dd6a8;
                }
                iter = &iter[sub_a6e2d0(iter, (v8 * 0x10000 | v8 >> 48) & 0xffffffffffff00ff & 0xff)];
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                if (1)
                    goto LABEL_9dd6c4;
LABEL_9dd6a8:
                if (!(v8 & 0xff0000000000))
                {
                    if (!(v8 & 0xff00000000))
                    {
                        if (!1)
                            goto LABEL_9dd720;
                        goto LABEL_9dd704;
                    }
                    goto LABEL_9dd6e0;
                }
LABEL_9dd6c4:
                iter = &iter[sub_a6e2d0(iter, (v8 * &g_1000000 | v8 >> 40) & 0xffffffffff0000ff & 0xff)];
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
LABEL_9dd6e0:
                iter = &iter[sub_a6e2d0(iter, (v8 * 0x100000000 | v8 >> 32) & 0xffffffff000000ff & 0xff)];
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                if (1)
                    goto LABEL_9dd720;
LABEL_9dd704:
                if (!(v8 & 0xff000000))
                {
                    if (!(v8 & 0xff0000))
                    {
                        if (!1)
                            goto LABEL_9dd604;
                        goto LABEL_9dd760;
                    }
                    goto LABEL_9dd73c;
                }
LABEL_9dd720:
                iter = &iter[sub_a6e2d0(iter, (v8 * 0x10000000000 | v8 >> 24) & 0xffffff00000000ff & 0xff)];
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
LABEL_9dd73c:
                iter = &iter[sub_a6e2d0(iter, __ROL__((unsigned int)v8, 16) & 0xffff00ff & 0xff)];
                v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                if (1)
                    goto LABEL_9dd604;
LABEL_9dd760:
                if (v8 & 0xff00)
                {
LABEL_9dd604:
                    iter = &iter[sub_a6e2d0(iter, __ROL__((unsigned int)v8, 24) & 0xff0000ff & 0xff)];
                    v8 = *(long long *)(a0->field_0 + v6 * 8 - 8);
                    goto LABEL_9dd620;
                }
                else if ((char)v8)
                {
LABEL_9dd620:
                    iter = &iter[sub_a6e2d0(iter, (unsigned int)v8 & 0xff)];
                    v7 = 1;
                    continue;
                }
                else
                {
                    v7 = 0;
                }
            } while ((v6 -= 1, v6 + 1 > 1));
        }
        *iter = 0;
        return v3;
    }
}
