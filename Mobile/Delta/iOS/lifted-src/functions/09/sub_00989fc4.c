/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989fc4..0x98a058 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989fc4_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_1c;
} st_989fc4_0;


unsigned long long sub_989fc4(st_989fc4_0 *a0)
{
    long long v3;  // x0
    long long v4;  // x19
    unsigned long long v5;  // x21
    char v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_977398(a0->field_0);
    if (*(int *)((char *)&a0->field_18 + 4))
        return 1;
    v4 = v3;
    if (!(int)a0->field_18)
    {
        *(unsigned int *)&a0->field_18 = 1;
        sub_ad94e8(a0->field_8);
    }
    sub_ad93b4(v4);
    if (sub_ad95f8(a0->field_10, &v0))
    {
        v5 = 1;
        *(unsigned int *)((char *)&a0->field_18 + 4) = 1;
    }
    else
    {
        v5 = 0;
    }
    sub_ad9384(v4);
    return v5;
}
