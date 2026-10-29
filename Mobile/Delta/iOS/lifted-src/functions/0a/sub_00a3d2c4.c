/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3d2c4..0xa3d390 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3d2c4_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3d2c4_0 *field_30;
} st_a3d2c4_1;

typedef struct st_a3d2c4_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3d2c4_0;


long long sub_a3d2c4(unsigned long a0, unsigned long a1, st_a3d2c4_1 *a2)
{
    long long v2;  // x22
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_20;
    switch ((unsigned int)sub_a5b018(v2))
    {
    case 116:
        v4 = sub_c4c40(sub_a5ace4(v2));
        if (!v4)
            return 0;
        break;
    case 28:
        v4 = sub_c4c40(sub_a5af48(v2));
        if (!v4)
            return 0;
        break;
    default:
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1747, "get_dh_dsa_payload_p");
        sub_a36abc(6, 224, 0);
        return 0;
    }
    if (a2->field_30->field_8 != 2)
        return 0;
    a2->field_20 = v4;
}
