/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd2fc..0x9fd368 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd2fc_0 {
    char padding_0[32];
    long long field_20;
} st_9fd2fc_0;


unsigned long long sub_9fd2fc(unsigned long a0, st_9fd2fc_0 *a1)
{
    long long v2;  // x20
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_20)
    {
        v2 = sub_9fd9a4(a1->field_20, 135);
        if (!v2)
            return 0;
    }
    else
    {
        v2 = 0;
    }
    v3 = sub_a5ab14();
    if ((unsigned int)v3)
        return v3;
    sub_9ffb3c(v2);
    return 0;
}
