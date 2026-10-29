/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa97ac..0xaa9818 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa97ac_0 {
    long long field_0;
    char padding_8[8];
    struct st_aa97ac_0 *field_10;
    struct st_aa97ac_0 *field_14;
    char padding_1c[12];
    long long field_28;
} st_aa97ac_0;


void sub_aa97ac(st_aa97ac_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (!a0)
    {
        return;
    }
    else if (!(int)a0->field_10)
    {
        v0 = &v1;
        if (*(int *)((char *)&a0->field_10 + 4))
            sub_a6d4c0(a0->field_0, *(long long *)&a0->padding_1c[8], "crypto/rand/rand_pool.c", 100);
        else
            sub_a6c4e8(a0->field_0, *(long long *)&a0->padding_1c[8], "crypto/rand/rand_pool.c", 0x66);
    }
}
