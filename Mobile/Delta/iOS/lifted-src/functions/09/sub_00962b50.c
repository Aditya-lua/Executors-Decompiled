/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962b50..0x962b90 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962b50_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_962b50_0;


int sub_962b50(st_962b50_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a2 <= 0x200)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        _memcpy(a0 + 5);
        a0->field_8 = a2;
        return 1;
    }
    return 0;
}
