/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167570..0x1675dc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167570_0 {
    char padding_0[8];
    char *field_8;
    struct st_167570_1 *field_10;
} st_167570_0;

typedef struct st_167570_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    uint128_t field_10;
} st_167570_1;


char * sub_167570(st_167570_0 *a0, void* a1)
{
    char *v2;  // x8
    unsigned long long v3;  // x9
    char *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v4 = sub_1686b0(a0);
        a0->field_8 = v4;
        return v4 - 32;
    }
    v3 = *(long long *)a1;
    *(int *)&v2[8] = (int)a1[8];
    *(unsigned long long *)v2 = v3;
    *(int128_t *)&v2[16] = (int128_t)a1[16];
    *(unsigned long long *)&a1[16] = 0;
    *(unsigned long long *)&a1[24] = 0;
    a0->field_8 = v2 + 32;
    return v2;
}
