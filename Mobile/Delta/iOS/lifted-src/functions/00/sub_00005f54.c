/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5f54..0x5fcc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5f54_2 {
    struct st_5f54_1 *field_0;
    struct st_5f54_1 *field_8;
    struct st_5f54_1 *field_10;
} st_5f54_2;

typedef struct st_5f54_0 {
    unsigned long long field_0;
} st_5f54_0;

typedef struct st_5f54_1 {
    struct st_5f54_0 *field_0;
} st_5f54_1;


st_5f54_0 ** sub_5f54(unsigned long a0, st_5f54_2 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8)
    {
        (*(long long *)*(long long *)*(long long *)a1->field_0)();
    }
    else if (a1->field_10)
    {
        goto *((void *)(*(long long *)*(long long *)a1->field_10));
    }
    else
    {
        return 0;
    }
}
