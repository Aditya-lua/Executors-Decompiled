/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dcf14..0x9dd05c (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dcf14_0 {
    long long field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[8];
    char field_28;
    char padding_29[7];
    char field_30;
} st_9dcf14_0;


char sub_9dcf14(st_9dcf14_0 *a0, long long a1)
{
    unsigned long long v2;  // 4118
    char v3;  // w8
    char v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 && *(long long *)&a0->padding_8[0])
    {
        v2 = arm64g_calculate_condition(1, *(int *)&a0->field_28, 1, 0);
        if (!(v2 & 1))
        {
            v3 = *(int *)&a0->field_28 + 1;
            *(unsigned int *)&a0->field_28 = v3;
            if (v3 != 32 || !*(long long *)&a0->padding_8[8] || a0->field_30 >> 1 & 1)
                goto LABEL_9dcfc0;
            v4 = sub_9dd05c(a0, 0, 0, a1, 0, 0);
            if (!v4)
                goto LABEL_9dd040;
        }
        else
        {
            *(unsigned int *)&a0->field_28 = 1;
LABEL_9dcfc0:
            if (!(a0->field_30 & 1))
            {
                if (*(long long *)((char *)&a0[1].field_0 + 7))
                {
                    v4 = sub_9e671c();
                    if (!v4 || (v5 = a0->field_0, v4 = sub_9e671c(v5, v5, v5, *(long long *)((char *)&a0[1].field_0 + 7), a1), !v4))
                        goto LABEL_9dd040;
                }
                else
                {
                    v4 = sub_9e6404();
                    if (!v4 || (v6 = a0->field_0, v4 = sub_9e6404(v6, v6, v6, a0->field_18, a1), !v4))
                        goto LABEL_9dd040;
                }
            }
        }
        v4 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_blind.c", 96, "BN_BLINDING_update");
        sub_a36abc(3, 107, 0);
        v4 = 0;
    }
LABEL_9dd040:
    if (*(int *)&a0->field_28 == 32)
        *(unsigned int *)&a0->field_28 = 0;
    return v4;
}
