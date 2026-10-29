/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x994b7c..0x994d78 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_994b7c_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_994b7c_0;


unsigned int sub_994b7c(st_994b7c_0 *a0, unsigned long a1, long long a2, unsigned long a3, long long a4, unsigned long a5, long long a6, long long n, unsigned long a8, unsigned long a9, unsigned long a10, long long a11, long long a12)
{
    unsigned int v1;  // w8
    long long v2;  // x0
    long long v3;  // x22
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x1
    long long v7;  // x1
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = a0->field_1c;
    if (a11)
    {
        v2 = sub_a4bc70();
        *(long long *)&a0[129].padding_0[0] = v2;
        if (v2)
        {
            v3 = v2;
            v4 = sub_a3f728();
            *(long long *)&a0[129].padding_0[24] = v4;
            if (!v4)
            {
                sub_a368c8();
                v7 = 43;
            }
            else if ((int)sub_a3fe04() <= 0)
            {
                sub_a368c8();
                v7 = 48;
            }
            else if (a12 && (v5 = sub_9f2a70(a12), *(long long *)&a0[130].padding_0[0] = v5, !v5))
            {
                sub_a368c8();
                sub_a369bc("ssl/record/methods/ssl3_meth.c", 56, "ssl3_set_crypto_state");
                v6 = 142;
LABEL_994d0c:
                sub_a36abc(20, v6, 0);
LABEL_994d14:
                return 0xfffffffe;
            }
            else if (sub_a4c694(v3, a8, 0, a2, a4, v1 == 1))
            {
                if (sub_9ffdd8(sub_a2d030(v3)) && !sub_996ed0(a0, v3, a8, a11))
                    goto LABEL_994d14;
                if ((unsigned long long)n < 65)
                {
                    _memcpy(&a0[131].padding_0[16], a6, n);
                    return 1;
                }
                sub_a368c8();
                v7 = 78;
            }
            else
            {
                sub_a368c8();
                v7 = 63;
            }
        }
        else
        {
            sub_a368c8();
            v7 = 36;
        }
    }
    else
    {
        sub_a368c8();
        v7 = 31;
    }
    sub_a369bc("ssl/record/methods/ssl3_meth.c", v7, "ssl3_set_crypto_state");
    v6 = 786691;
    goto LABEL_994d0c;
}
