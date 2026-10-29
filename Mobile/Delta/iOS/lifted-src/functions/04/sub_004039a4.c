/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4039a4..0x403a00 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4039a4_0 {
    char field_0;
} st_4039a4_0;


void* sub_4039a4(void* a0, unsigned long long *a1)
{
    unsigned long long v4;  // x20
    st_4039a4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4039a4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    *(unsigned long long *)&a0[8] = 0;
    *(unsigned long long *)a0 = 0;
    v4 = *a1;
    v1 = &v0;
    v0 = &v1;
    sub_2a6e94(a0 + 8, 0);
    *(char *)a0 = 5;
    *(unsigned long long *)&a0[8] = v4;
    return a0;
}
