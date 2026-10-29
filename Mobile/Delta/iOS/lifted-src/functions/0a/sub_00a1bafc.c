/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1bafc..0xa1bb7c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1bafc_0 {
    struct st_a1bafc_0 *field_0;
    char padding_8[64];
    struct st_a1bafc_0 *field_48;
    struct st_a1bafc_0 *field_4c;
    struct st_a1bafc_0 *field_50;
} st_a1bafc_0;


st_a1bafc_0 * sub_a1bafc(st_a1bafc_0 *a0, st_a1bafc_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        if (*(int *)((char *)&a0->field_0->field_0 + 4) != 407 || !(int)a0->field_48 || !*(int *)((char *)&a0->field_48 + 4) || (int)a0->field_4c)
        {
            v0 = &v2;
            v1 = v3;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 1357, "EC_GROUP_get_trinomial_basis");
            sub_a36abc(16, 0xc0101, 0);
            return 0;
        }
        if (a1)
            *(int *)&a1->field_0 = *(int *)((char *)&a0->field_48 + 4);
        a0 = 1;
    }
    return (unsigned int)a0;
}
