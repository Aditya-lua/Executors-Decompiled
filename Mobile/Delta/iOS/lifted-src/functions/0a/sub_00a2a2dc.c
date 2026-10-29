/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a2dc..0xa2a41c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2a2dc_1 {
    unsigned long long field_0;
    char padding_8[8];
    char field_10;
    uint128_t field_11;
    uint128_t field_21;
    char field_31[25];
    char field_3a;
    char padding_3b[29];
    unsigned long long field_58;
    unsigned int field_60;
} st_a2a2dc_1;

typedef struct st_a2a2dc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    uint128_t field_11;
    uint128_t field_21;
    char field_31[25];
    char field_3a;
    char padding_3b[29];
    unsigned long long field_58;
    unsigned int field_60;
    unsigned int field_64;
} st_a2a2dc_0;


st_a2a2dc_0 * sub_a2a2dc(st_a2a2dc_1 *a0, unsigned long long a1)
{
    st_a2a2dc_0 *v2;  // x0
    unsigned long long v3;  // x8
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(104, "crypto/ec/ecx_backend.c", 109);
    if (!v2)
        return v2;
    v2->field_0 = a0->field_0;
    v2->field_10 = v2->field_10 & 254;
    *(long long *)&v2->field_31[24] = *(long long *)&a0->field_31[24];
    *(int *)&v2->padding_3b[6] = *(int *)&a0->padding_3b[6];
    /* unsupported instruction */;
    *(unsigned int *)&v2->padding_3b[10] = 1;
    if (!a0->padding_8 || (v3 = sub_a6d9b4(a0->padding_8, "crypto/ec/ecx_backend.c", 123), v2 = v2, v2->field_8 = v3, v3))
    {
        if (a1 >> 1 & 1 && a0->field_10 & 1)
        {
            *(int128_t *)&(&v2->field_10)[1] = *(int128_t *)&(&a0->field_10)[1];
            *(int128_t *)((char *)&v2->field_11 + 1) = *(int128_t *)((char *)&a0->field_11 + 1);
            *(int128_t *)((char *)&v2->field_21 + 1) = *(int128_t *)((char *)&a0->field_21 + 1);
            *(int128_t *)((char *)&v2->field_21 + 10) = *(int128_t *)((char *)&a0->field_21 + 10);
            v2->field_10 = v2->field_10 | 1;
        }
        if (!(a1 & 1))
        {
            return v2;
        }
        else if (*(long long *)&a0->field_31[16])
        {
            v4 = v2;
            if (sub_a2a950())
            {
                _memcpy(*(long long *)(v4 + 80), *(long long *)&a0->field_31[16], *(long long *)(v4 + 88));
                return v4;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_backend.c", 137, "ossl_ecx_key_dup");
            sub_a36abc(16, 0x80010, 0);
            v2 = v4;
        }
        else
        {
            return v2;
        }
    }
    sub_a2a8a4(v2);
    return 0;
}
