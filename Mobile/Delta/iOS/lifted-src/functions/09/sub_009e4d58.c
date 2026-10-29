/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4d58..0x9e4db0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4d58_0 {
    struct st_9e4d58_1 *field_0;
    unsigned int field_8;
    long long field_c;
    long long field_10;
} st_9e4d58_0;

typedef struct st_9e4d58_1 {
    long long field_0;
} st_9e4d58_1;


long long sub_9e4d58(st_9e4d58_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (0 >= (int)(&a0->field_8)[1])
    {
        v2 = sub_9e49b8(a0, 1);
        if (!v2)
            return v2;
    }
    *(unsigned int *)&a0->field_c = 0;
    *(long long *)a0->field_0 = a1;
    a0->field_8 = a1 != 0;
    return 1;
}
