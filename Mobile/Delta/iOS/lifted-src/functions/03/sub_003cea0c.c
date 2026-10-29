/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cea0c..0x3ceae0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cea0c_0 {
    char field_0;
} st_3cea0c_0;

extern unsigned long long g_e7efb0;
extern unsigned long long g_e7efc0;

int sub_3cea0c(long long *a0)
{
    unsigned int v4;  // w0
    st_3cea0c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3cea0c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_3d2248(*a0))
        return 0xff;
    v4 = sub_3d706c(*a0);
    do
    {
        if (v4 != 0xff)
            goto *((void *)(g_e7efc0));
        if (sub_3d2248(*a0))
            goto LABEL_3cea88;
    } while ((v4 = sub_3d706c(*a0), 253 < v4 - 1));
LABEL_3cea88:
    goto *((void *)(g_e7efb0));
}
