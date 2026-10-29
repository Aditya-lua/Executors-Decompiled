/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d694..0xc0d718 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d694_1 {
    unsigned long long field_0;
    struct st_c0d694_0 *field_8;
    unsigned long long field_10;
} st_c0d694_1;

typedef struct st_c0d694_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    long long field_10;
} st_c0d694_0;


void sub_c0d694(st_c0d694_1 *a0)
{
    unsigned long long v2;  // x21
    unsigned long long *v3;  // x22
    unsigned long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if (a0->field_10)
    {
        v3 = &a0->field_8->field_8;
        do
        {
            v4 = v2;
            if ((*((char *)v3 - 8) == 8 || *((char *)v3 - 8) == 5) && *v3)
                _free(v3[1]);
        } while ((v3 += 4, v2 = v4 - 1, v4 != 1));
    }
    if (!a0->field_0)
        return;
    _free();
    return;
}
