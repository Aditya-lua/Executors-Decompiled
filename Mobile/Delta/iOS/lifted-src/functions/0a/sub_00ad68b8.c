/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad68b8..0xad692c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad68b8_0 {
    struct st_ad68b8_0 *field_0;
    struct st_ad68b8_1 *field_8;
} st_ad68b8_0;

typedef struct st_ad68b8_1 {
    struct st_ad68b8_0 *field_0;
} st_ad68b8_1;


char * sub_ad68b8(char *a0)
{
    char *v5;  // x8
    char *v6;  // w10
    st_ad68b8_0 **ptr;  // x9
    char *v8;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char *v12;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v5 = a0;
    v6 = (char *)*(int *)a0;
    if (!v6)
        return 0;
    ptr = *(long long *)&v5[8];
    v8 = *ptr;
    if (v6 != 1)
    {
        v0 = v9;
        v1 = v10;
        v2 = &v4;
        v3 = v11;
        _memmove(ptr, ptr + 1, (long long)((unsigned long long)(v6 - 1) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__((unsigned long long)(v6 - 1), 3) & 0x7fffffff8 & 0x7ffffffff);
        v12 = (char *)(*(int *)v5 - 1);
    }
    else
    {
        v12 = (char *)0;
    }
    *(unsigned int *)v5 = (unsigned int)v12;
    return v8;
}
