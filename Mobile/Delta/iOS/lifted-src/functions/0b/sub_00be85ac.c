/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe85ac..0xbe8628 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be85ac_0 {
    char padding_0[24];
    unsigned long long field_18;
    struct st_be85ac_1 *field_20;
} st_be85ac_0;

typedef struct st_be85ac_1 {
    unsigned long long field_0;
} st_be85ac_1;


int sub_be85ac(unsigned long a0, st_be85ac_0 *a1, unsigned int a2, unsigned long a3, unsigned long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 != 0x110000)
    {
        a1->field_20();
    }
    else if (a3)
    {
        goto *((void *)(a1->field_18));
    }
    else
    {
        return 0;
    }
}
