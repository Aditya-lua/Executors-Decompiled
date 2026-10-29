/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ed95c..0x8ed9ac (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8ed95c_0 {
    long long field_0;
} st_8ed95c_0;


void sub_8ed95c(st_8ed95c_0 **a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long *i;  // x20
    unsigned long long *v13;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_91e21c();
    i = a0[1];
    if (a0[1] != a0[2])
    {
        do
        {
            v13 = i + 1;
            sub_4e14(*i, 64, 8);
            i = v13;
        } while (i != a0[2]);
    }
}
