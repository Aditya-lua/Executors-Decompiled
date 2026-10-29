/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980df4..0x980e14 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980df4_0 {
    char padding_0[64];
    struct st_980df4_0 *field_40;
    char padding_48[40];
    char field_70;
} st_980df4_0;


long long sub_980df4(st_980df4_0 *a0)
{
    st_980df4_0 *v0;  // x0
    st_980df4_0 *v1;  // w8
    st_980df4_0 *v2;  // x0

    do
    {
        v0 = a0;
        v1 = (st_980df4_0 *)(__ROL__(v0->field_70, 29) & 3758096387 & 3);
    } while (!v1 && (v2 = v0->field_40, a0 = v0->field_40, v0->field_40));
    return v1 != 1;
}
