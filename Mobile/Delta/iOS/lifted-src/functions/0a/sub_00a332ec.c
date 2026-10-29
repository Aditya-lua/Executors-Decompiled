/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa332ec..0xa33340 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a332ec_0 {
    char padding_0[8];
    long long field_8;
} st_a332ec_0;


long long sub_a332ec(st_a332ec_0 *a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a1)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_lib.c", 216, "ENGINE_set_name");
        sub_a36abc(38, 0xc0102, 0);
        return 0;
    }
    a0->field_8 = a1;
    return 1;
}
