/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a904..0xa6a9e8 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a904_0 {
    char padding_0[8];
    long long field_8;
} st_a6a904_0;


int sub_a6a904(st_a6a904_0 *a0, unsigned long long a1, long long a2)
{
    long long v2;  // x19
    long long v3;  // x0
    long long v4;  // x20
    unsigned int v5;  // w0
    unsigned int v6;  // w23
    unsigned int v7;  // w23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 524303;
    v3 = a0->field_8;
    if (v3 || (v3 = sub_ad61b4(0), a0->field_8 = v3, v3))
    {
        v5 = sub_ad69e4(v3);
        if ((int)a1 >= (int)v5)
        {
            v6 = (unsigned int)(a1 - v5) + 1;
            do
            {
                v7 = v6;
                if (!sub_ad68a0(a0->field_8, 0))
                {
                    v4 = 481;
                    goto LABEL_a6a9a4;
                }
            } while ((v6 = v7 - 1, v7 != 1));
        }
        if (sub_ad6a28(a0->field_8, a1, a2) == a2)
            return 1;
        v2 = 524550;
        v4 = 487;
    }
    else
    {
        v4 = 474;
    }
LABEL_a6a9a4:
    sub_a368c8();
    sub_a369bc("crypto/ex_data.c", v4, "CRYPTO_set_ex_data");
    sub_a36abc(15, v2, 0);
    return 0;
}
