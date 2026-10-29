/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bce8..0xa6be28 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6bce8_0 {
    struct st_a6bce8_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_a6bce8_0 *field_18;
} st_a6bce8_0;

extern long long g_a6be70;
extern long long g_f08ff0;
extern long long g_f08ff8;
extern st_a6bce8_0 *g_f12e74;
extern st_a6bce8_0 *g_f12e78;

int sub_a6bce8(st_a6bce8_0 *a0, unsigned long a1, unsigned long a2)
{
    st_a6bce8_0 *v2;  // x0
    st_a6bce8_0 *v3;  // x0
    st_a6bce8_0 *v4;  // w0
    long long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7bbe0(&g_f08ff0);
    if (v2)
    {
LABEL_a6bd1c:
        v3 = sub_a6bf4c(32, "crypto/initthread.c", 426);
        if (v3)
        {
            v3->field_8 = a1;
            v3->field_10 = a2;
            v3->field_0 = a0;
            v3->field_18 = v2->field_0;
            v2->field_0 = v3;
            v3 = 1;
        }
    }
    else
    {
        v3 = sub_a6bffc(8, "crypto/initthread.c", 101);
        if (v3)
        {
            v2 = v3;
            if (!sub_a7bbe8(&g_f08ff0, v2))
            {
                v5 = 105;
                goto LABEL_a6be0c;
            }
            if (sub_a7c208(&g_f08ff8, &g_a6be70) && (int)g_f12e74 && g_f12e78 && sub_a7c198(g_f12e78->field_8))
            {
                v4 = (st_a6bce8_0 *)(unsigned int)sub_ad68a0(g_f12e78->field_0, v2);
                sub_a7c1b4(g_f12e78->field_8);
                if (!v4)
                    goto LABEL_a6bdd8;
                goto LABEL_a6bd1c;
            }
            else
            {
LABEL_a6bdd8:
                sub_a7bbe8(&g_f08ff0, 0);
                v5 = 112;
LABEL_a6be0c:
                sub_a6c2e4(v2, "crypto/initthread.c", v5);
                v3 = 0;
            }
        }
    }
    return (unsigned int)v3;
}
