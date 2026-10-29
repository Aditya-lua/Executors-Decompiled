/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61590..0xc6186c (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61590_0 {
    char padding_0[56];
    struct st_c61590_1 *field_38;
    char padding_40[40];
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
} st_c61590_0;

typedef struct st_c61590_1 {
    unsigned long long field_0;
} st_c61590_1;

extern char g_10002b0;

int sub_c61590(st_c61590_0 *a0, unsigned int a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (a0)
    {
        if (!a0->field_68 && (unsigned int)(1 << ((char)a1 & 63)) & *(int *)&a0->padding_40[32 + (a1 >> 3 & 0x1ffffff8)])
        {
            a0->field_68 = a1;
            a0->field_70 = a2;
            a0->field_78 = a3;
            a0->field_80 = a4;
            a0->field_38();
        }
        a0 = 0;
    }
    if (*(long long *)&g_10002b0 == v0)
        return (unsigned int)a0;
    ___stack_chk_fail();
}
