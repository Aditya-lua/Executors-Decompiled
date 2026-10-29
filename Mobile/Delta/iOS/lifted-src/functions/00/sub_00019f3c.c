/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19f3c..0x19f98 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19f3c_1 {
    char padding_0[8];
    void* field_8;
} st_19f3c_1;


void sub_19f3c(st_19f3c_1 *a0, void* a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == a1)
    {
        a0->field_8 = a1;
        return;
    }
    (*(long long *)*(long long *)((char *)a0->field_8 - 48))();
}
