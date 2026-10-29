/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7954c..0xb7966c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7954c_2 {
    char padding_0[8];
    struct st_b7954c_0 *field_8;
} st_b7954c_2;

typedef struct st_b7954c_0 {
    char padding_0[24];
    struct st_b7954c_1 *field_18;
} st_b7954c_0;

typedef struct st_b7954c_1 {
    unsigned long long field_0;
} st_b7954c_1;


unsigned long long sub_b7954c(st_b7954c_2 **a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long long v2;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 0;
    v2 = a2 * 64;
    do
    {
        if (v2 != 64)
        {
            if (!(sub_b79024(a0, a1) & 1))
                *a0->field_8->field_18();
            return 1;
        }
        if (*a1 == 11)
            *a0->field_8->field_18();
        if (sub_b79024(a0, a1) & 1)
            return 1;
        a1 += 8;
        v2 = 0;
    } while (0);
    return 0;
}
