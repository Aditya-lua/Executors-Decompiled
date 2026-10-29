/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74d58..0x74dcc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74d58_0 {
    char field_0;
} st_74d58_0;


char * sub_74d58(unsigned long a0, char *i, char *a2, char *a3)
{
    char *v8;  // x19
    char *v9;  // x1
    unsigned long v0;  // [bp-0x50]
    st_74d58_0 **v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    char *v4;  // [bp-0x30]
    char *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a3;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (i != a2)
    {
        do
        {
            v9 = i + 1;
            *v8 = *i;
            v8 = v5 + 1;
            v5 = v8;
            i = v9;
        } while (i != a2);
    }
    v3 = 1;
    sub_746b4(&v0);
    return v8;
}
