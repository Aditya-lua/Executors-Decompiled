/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976d74..0x976da0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976d74_0 {
    char padding_0[1048];
    long long field_418;
} st_976d74_0;


long long sub_976d74(long long a0, long long a1, st_976d74_0 *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    return sub_975c60(a2->field_418, a0, a1) != 0;
}
