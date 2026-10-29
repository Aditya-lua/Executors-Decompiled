/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1c68..0xab1c98 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1c68_0 {
    char padding_0[128];
    long long field_80;
} st_ab1c68_0;


int sub_ab1c68(st_ab1c68_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_aadf28(a0->field_80);
    a0->field_80 = a1;
    return 1;
}
