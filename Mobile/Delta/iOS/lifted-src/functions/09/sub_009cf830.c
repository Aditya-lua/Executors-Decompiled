/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf830..0x9cf86c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf830_0 {
    unsigned long long field_0;
    void* field_8;
} st_9cf830_0;


void* sub_9cf830(void* a0, void* a1, void* a2, st_9cf830_0 *a3)
{
    void* v0;  // x8

    if (a0)
        *(unsigned long long *)a0 = a3->field_0;
    if (!a1)
        return a0;
    v0 = a3->field_8;
    if (!v0)
    {
        *(unsigned int *)a1 = 0xffffffff;
        return a0;
    }
    *(int *)a1 = *(int *)v0;
    if (!a2)
        return a0;
    *(long long *)a2 = (long long)v0[8];
    return a0;
}
