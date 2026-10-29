/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5cfb0..0xa5d0c8 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5cfb0_0 {
    char field_0;
    char padding_1[31];
    long long field_20;
} st_a5cfb0_0;


unsigned int sub_a5cfb0(st_a5cfb0_0 *a0, char a1, long long a2, long long a3)
{
    char v2;  // x8
    char v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a0->field_0 >> 3 & 1)
    {
        if (a1)
        {
            v2 = *(long long *)a1;
            if (v2)
            {
                v3 = 0;
            }
            else
            {
                v2 = sub_a5ba1c();
                *(unsigned long long *)a1 = v2;
                v3 = v2;
                if (!v3)
                {
                    sub_a368c8(a0, a1, a2, a3);
                    sub_a369bc("crypto/evp/pmeth_gn.c", 378, "EVP_PKEY_fromdata");
                    sub_a36abc(6, 0x80006, 0);
                    return 0xffffffff;
                }
            }
            if (sub_a54bc8(v2, a0->field_20))
                return 1;
            if (!v3)
                return 0;
            *(unsigned long long *)a1 = 0;
            sub_a5a4c8(v3);
            return 0;
        }
        else
        {
            return 0xffffffff;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/pmeth_gn.c", 367, "EVP_PKEY_fromdata");
    sub_a36abc(6, 150, 0);
    return 0xfffffffe;
}
