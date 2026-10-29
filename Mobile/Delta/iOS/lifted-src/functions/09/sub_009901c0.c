/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9901c0..0x990214 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9901c0_0 {
    struct st_9901c0_1 *field_0;
    unsigned long long field_8;
} st_9901c0_0;

typedef struct st_9901c0_1 {
    char field_0;
} st_9901c0_1;


long long sub_9901c0(st_9901c0_0 *a0)
{
    char *v0;  // x9
    long long v1;  // x10
    char *v2;  // x8
    long long v3;  // x8

    v0 = a0->field_0;
    v1 = a0->field_8;
    if (v1 >= 1)
    {
        v2 = v0;
        do
        {
        } while (!*v2 && (v2 += 1, v2 < &v0[v1]));
    }
    else
    {
        v2 = v0;
    }
    v3 = v2 - v0;
    if ((unsigned long long)v3 <= (unsigned long long)v1)
    {
        a0->field_0 = &v0[v3];
        a0->field_8 = v1 - v3;
        return v3;
    }
    return 0;
}
