/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3cefc..0xa3cfc4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3cefc_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3cefc_0 *field_30;
} st_a3cefc_1;

typedef struct st_a3cefc_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3cefc_0;


long long sub_a3cefc(unsigned long a0, unsigned long a1, st_a3cefc_1 *a2)
{
    long long v2;  // x21
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_20;
    a2->field_20 = 0;
    if (a2->field_30->field_8 != 2)
        return 0;
    switch ((unsigned int)sub_a5b018(v2))
    {
    case 408:
        v4 = sub_962b90(sub_a59bc4(v2));
    case 28:
        v4 = sub_9ffdd8(sub_a5af48(v2));
        break;
    default:
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1587, "get_payload_private_key");
        sub_a36abc(6, 224, 0);
        return 0;
    }
    a2->field_20 = v4;
}
