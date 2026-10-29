/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab6f64..0xab71a0 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab6f64_0 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    void* field_98;
} st_ab6f64_0;


long long sub_ab6f64(st_ab6f64_0 *a0, long long a1, long long a2, long long a3, unsigned long a4)
{
    void* v3;  // x25
    long long v4;  // x0
    unsigned int v5;  // w0
    unsigned long v6;  // x0
    long long v8;  // x1
    unsigned long v9;  // x0
    unsigned long v10;  // x0
    char v0;  // [bp-0x58], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_98;
    v4 = sub_a59af4(a0->field_88);
    if ((long long)v3[32])
    {
        if ((int)v3[28] == 1)
            sub_9c7b68();
        v5 = sub_a50ac8();
        if ((int)v5 > 0)
        {
            if (v5 == a4)
            {
                if ((int)v3[28] != 6)
                {
                    if ((int)v3[28] == 5)
                    {
                        if ((int)sub_ab71a0(a0, 0, &v0, a1, a2) >= 1)
                        {
                            if (v0 == a4)
                                return !_memcmp(a3, (long long)v3[56], a4);
                            return 0;
                        }
                        else
                        {
                            return 0;
                        }
                    }
                }
                else
                {
                    if (!(long long)v3[56])
                    {
                        v6 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
                        *(unsigned long *)&v3[56] = v6;
                        if (v6)
                            goto LABEL_ab7140;
                    }
                    else
                    {
LABEL_ab7140:
                        if ((int)sub_aafc18(a2, a1) < 1)
                            return 0;
                        return (int)sub_ab8250(v4, a3, (long long)v3[32], (long long)v3[40], (long long)v3[56], (int)v3[48]) > 0;
                    }
                }
            }
            else
            {
                sub_a368c8();
                v8 = 287;
LABEL_ab70f0:
                sub_a369bc("crypto/rsa/rsa_pmeth.c", v8, "pkey_rsa_verify");
                sub_a36abc(4, 143, 0);
            }
        }
        else
        {
            sub_a368c8();
            v8 = 283;
            goto LABEL_ab70f0;
        }
    }
    else if (!(long long)v3[56])
    {
        v9 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
        *(unsigned long *)&v3[56] = v9;
        if (v9)
            goto LABEL_ab7020;
    }
    else
    {
LABEL_ab7020:
        v10 = sub_aafc18(a2, a1);
        if (!(unsigned int)v10)
        {
            return v10;
        }
        else if ((int)v10 == a4)
        {
            return !_memcmp(a3, (long long)v3[56], a4);
        }
        else
        {
            return 0;
        }
    }
    return 0xffffffff;
}
