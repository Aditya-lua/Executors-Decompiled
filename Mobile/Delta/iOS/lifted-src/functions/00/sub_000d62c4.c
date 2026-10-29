/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd62c4..0xd6314 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d62c4_0 {
    long long field_0;
} st_d62c4_0;


unsigned long long * sub_d62c4(st_d62c4_0 **a0)
{
    long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!*v2)
        return v2;
    sub_e6bcc(v2, *v2);
}
