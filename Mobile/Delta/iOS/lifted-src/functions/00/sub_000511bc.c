/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x511bc..0x51260 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_511bc_3 {
    char padding_0[32];
    struct st_511bc_1 *field_20;
    unsigned long long field_28;
    struct st_511bc_2 *field_30;
    unsigned long long field_38;
} st_511bc_3;

typedef struct st_511bc_1 {
    unsigned long long field_0;
} st_511bc_1;

typedef struct st_511bc_2 {
    struct st_511bc_1 *field_0;
} st_511bc_2;

typedef struct st_511bc_0 {
    char field_0;
} st_511bc_0;


unsigned long long sub_511bc(long long a0, st_511bc_3 *a1)
{
    unsigned long long i;  // x21
    st_511bc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_511bc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_28)
    {
        i = 0;
        do
        {
            sub_513b8(a0, *(long long *)&a1->field_20[i]);
            i += 1;
        } while (i < a1->field_28);
    }
    if (!a1->field_38)
        return 0;
    (*(long long *)*(long long *)*(long long *)a1->field_30)();
}
