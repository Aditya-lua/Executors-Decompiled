/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34bd8..0xa34c44 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a34bd8_1 {
    unsigned long long field_0;
} st_a34bd8_1;

typedef struct st_a34bd8_0 {
    char padding_0[80];
    struct st_a34bd8_1 *field_50;
} st_a34bd8_0;


unsigned long long * sub_a34bd8(st_a34bd8_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_50)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/tb_asnmth.c", 92, "ENGINE_get_pkey_asn1_meth");
        sub_a36abc(38, 101, 0);
        return 0;
    }
    a0->field_50();
}
