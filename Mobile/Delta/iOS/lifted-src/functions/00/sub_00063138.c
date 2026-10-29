/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63138..0x63168 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63138_1 {
    struct st_63138_0 *field_0;
    char padding_8[40];
    struct st_63138_2 *field_30;
    struct st_63138_2 *field_38;
} st_63138_1;

typedef struct st_63138_0 {
    char padding_0[104];
    unsigned long long field_68;
} st_63138_0;

typedef struct st_63138_2 {
    char field_0;
} st_63138_2;


int sub_63138(st_63138_1 *a0, char a1)
{
    char *v0;  // x8

    v0 = a0->field_30;
    if (v0 != a0->field_38)
    {
        a0->field_30 = v0 + 1;
        *v0 = a1;
        return a1;
    }
    goto *((void *)(a0->field_0->field_68));
}
