/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954220..0x954264 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954220_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_954220_0 *field_10;
} st_954220_0;


int sub_954220(unsigned long long *a0, unsigned long a1)
{
    st_954220_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(24, "ssl/pqueue.c", 20);
    if (v2)
    {
        v2->field_0 = *a0;
        v2->field_8 = a1;
        v2->field_10 = 0;
    }
    return (unsigned int)v2;
}
