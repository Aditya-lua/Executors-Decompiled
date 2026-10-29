/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1bb7c..0xa1bc24 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1bb7c_0 {
    struct st_a1bb7c_0 *field_0;
    char padding_8[64];
    struct st_a1bb7c_0 *field_48;
    struct st_a1bb7c_0 *field_4c;
    struct st_a1bb7c_0 *field_50;
    struct st_a1bb7c_0 *field_54;
    struct st_a1bb7c_0 *field_58;
} st_a1bb7c_0;


st_a1bb7c_0 * sub_a1bb7c(st_a1bb7c_0 *a0, st_a1bb7c_0 *a1, st_a1bb7c_0 *a2, st_a1bb7c_0 *a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        if (*(int *)((char *)&a0->field_0->field_0 + 4) != 407 || !(int)a0->field_48 || !*(int *)((char *)&a0->field_48 + 4) || !(int)a0->field_4c || !*(int *)((char *)&a0->field_4c + 4) || (int)a0->field_50)
        {
            v0 = &v2;
            v1 = v3;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 1377, "EC_GROUP_get_pentanomial_basis");
            sub_a36abc(16, 0xc0101, 0);
            return 0;
        }
        if (a1)
            *(int *)&a1->field_0 = *(int *)((char *)&a0->field_4c + 4);
        if (a2)
            *(int *)&a2->field_0 = (int)a0->field_4c;
        if (a3)
            *(int *)&a3->field_0 = *(int *)((char *)&a0->field_48 + 4);
        a0 = 1;
    }
    return (unsigned int)a0;
}
