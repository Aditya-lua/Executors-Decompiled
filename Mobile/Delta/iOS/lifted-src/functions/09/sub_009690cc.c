/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9690cc..0x96913c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9690cc_1 {
    char padding_0[2176];
    struct st_9690cc_0 *field_880;
} st_9690cc_1;

typedef struct st_9690cc_0 {
    char padding_0[30];
    char field_1e;
} st_9690cc_0;


char sub_9690cc(st_9690cc_1 *a0, unsigned long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!(a0->field_880->field_1e & 3))
    {
        v0 = &v2;
        v1 = v3;
        return sub_9684a0() != 0;
    }
    else if (a1 != 50380844 && a1 != 50380843)
    {
        return 0;
    }
}
