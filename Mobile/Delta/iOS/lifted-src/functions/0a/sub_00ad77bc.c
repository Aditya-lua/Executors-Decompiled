/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad77bc..0xad7838 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad77bc_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ad77bc_0;


st_ad77bc_0 * sub_ad77bc(unsigned long a0)
{
    st_ad77bc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "crypto/store/store_lib.c", 616);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 657, "OSSL_STORE_INFO_new_PARAMS");
        sub_a36abc(44, 0x8002c, 0);
        return 0;
    }
    v2->field_0 = 2;
    v2->field_8 = a0;
    return v2;
}
