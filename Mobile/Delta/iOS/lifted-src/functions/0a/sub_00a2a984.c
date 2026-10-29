/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a984..0xa2aad0 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2a984_0 {
    char padding_0[80];
    struct st_a2a984_0 *field_50;
} st_a2a984_0;


st_a2a984_0 * sub_a2a984(st_a2a984_0 *a0, st_a2a984_0 *a1, unsigned long a2, st_a2a984_0 *a3, unsigned long long *a4, unsigned long a5)
{
    long long v2;  // x1
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 || !a0 || !a1->field_50)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_key.c", 116, "ossl_ecx_compute_key");
        v2 = 128;
    }
    else if (a2 != 32 && a2 != 56)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_key.c", 122, "ossl_ecx_compute_key");
        v2 = 105;
    }
    else if (!a3)
    {
        *a4 = a2;
        return 1;
    }
    else if (a2 > a5)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_key.c", 131, "ossl_ecx_compute_key");
        v2 = 106;
    }
    else
    {
        if (a2 != 32)
        {
            if (sub_a07c60(a3))
            {
                *a4 = a2;
                return 1;
            }
            sub_a368c8();
            v3 = 160;
        }
        else if (!sub_a0daf0(a3))
        {
            sub_a368c8();
            v3 = 146;
        }
        else
        {
            *a4 = a2;
            return 1;
        }
        sub_a369bc("crypto/ec/ecx_key.c", v3, "ossl_ecx_compute_key");
        v2 = 164;
    }
    sub_a36abc(57, v2, 0);
    return 0;
}
