/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf86c..0x9cf8bc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf86c_0 {
    long long field_0;
    unsigned long long field_8;
} st_9cf86c_0;


unsigned long long sub_9cf86c(st_9cf86c_0 *a0, st_9cf86c_0 *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a9ae30(a0->field_0, a1->field_0);
    if ((unsigned int)v2)
    {
        return v2;
    }
    else if (!a0->field_8 && !a1->field_8)
    {
        return 0;
    }
}
