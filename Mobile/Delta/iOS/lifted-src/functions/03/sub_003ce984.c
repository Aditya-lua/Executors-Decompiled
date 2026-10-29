/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce984..0x3cea0c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ce984_1 {
    struct st_3ce984_0 *field_0;
} st_3ce984_1;

typedef struct st_3ce984_0 {
    char field_0;
} st_3ce984_0;

extern char _NSHomeDirectory;

unsigned int sub_3ce984(long long a0)
{
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    unsigned int v8;  // w0
    st_3ce984_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3ce984_0 *v1;  // [bp-0x58]
    st_3ce984_0 *v2;  // [bp-0x50], Other Possible Types: st_3ce984_1 **
    st_3ce984_0 **v3;  // [bp-0x48], Other Possible Types: st_3ce984_1 **, char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    v6 = sub_3d706c();
    v7 = sub_3d706c(a0);
    v2 = &v3;
    v3 = &v2;
    v8 = sub_3d706c(a0);
    return sub_3d706c(a0) | v8 * 0x100 | v6 * &_NSHomeDirectory | v7 * 0x10000;
}
