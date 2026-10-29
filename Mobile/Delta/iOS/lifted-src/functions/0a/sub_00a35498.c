/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35498..0xa35504 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a35498_0 {
    char padding_0[72];
    struct st_a35498_1 *field_48;
} st_a35498_0;

typedef struct st_a35498_1 {
    unsigned long long field_0;
} st_a35498_1;


unsigned long long * sub_a35498(st_a35498_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_48)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/tb_pkmeth.c", 79, "ENGINE_get_pkey_meth");
        sub_a36abc(38, 101, 0);
        return 0;
    }
    a0->field_48();
}
