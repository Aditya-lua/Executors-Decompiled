/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb11c38..0xb11ca0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b11c38_0 {
    char padding_0[416];
    unsigned long long field_1a0;
} st_b11c38_0;


int sub_b11c38(st_b11c38_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
    {
        return v2;
    }
    else if (!a0->field_1a0)
    {
        return 0;
    }
    else if (a3)
    {
        a0->field_1a0();
    }
    else
    {
        return sub_b11c8c();
    }
}
