/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf8bc..0x9cf950 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf8bc_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9cf8bc_0;

extern long long g_e8ac98;

unsigned long long sub_9cf8bc(long long *a0, st_9cf8bc_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x0
    unsigned long long v13;  // x21
    long long v14;  // x22
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (sub_a509f4(a1, "SHA1"))
        return 1;
    v12 = sub_9cde20(&g_e8ac98);
    if (!v12)
        return (unsigned int)v12;
    v13 = v12;
    if (!(a1->field_10 & 8))
        v14 = 5;
    else
        v14 = 0xffffffff;
    sub_9cf6d4(v13, sub_a99624(sub_9c7b68()), v14, 0);
    *a0 = v13;
    return 1;
}
