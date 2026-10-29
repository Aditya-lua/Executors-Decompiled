/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0be08..0xb0be78 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0be08_0 {
    char padding_0[108];
    char field_6c;
} st_b0be08_0;


int sub_b0be08(st_b0be08_0 *a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long i;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 < 8)
        return 1;
    i = 0;
    do
    {
        sub_9fbda0(a2 + i, a1 + i, &a0[1].padding_0[83], &a0[2].padding_0[0x66], &a0[4].padding_0[12], __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
        i += 8;
    } while (i <= a3 - 8);
    return 1;
}
