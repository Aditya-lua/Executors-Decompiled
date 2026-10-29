/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40a37c..0x40a434 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40a37c_0 {
    char field_0;
} st_40a37c_0;

long long sub_40a37c(unsigned long a0, unsigned long a1, unsigned long a2)
{
    st_40a37c_0 *v4;  // x8
    st_40a37c_0 **v5;  // x9
    unsigned long long v6;  // x10
    st_40a37c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_40a37c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = v1;
    v5 = v0;
    v6 = ((v4 | v5) ^ &(~v4)[-1 * (v5 | ~v4)]) + ((v4 | v5) & &(~v4)[-1 * (v5 | ~v4)]) * 2;
    if (a2 <= (((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 | v6 - (char *)v5 + 2 * (v5 & ~v6)) - ((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 & v6 - (char *)v5 + 2 * (v5 & ~v6)) ^ -((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 ^ v6 - (char *)v5 + 2 * (v5 & ~v6))) + (((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 | v6 - (char *)v5 + 2 * (v5 & ~v6)) - ((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 & v6 - (char *)v5 + 2 * (v5 & ~v6)) - ((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 ^ v6 - (char *)v5 + 2 * (v5 & ~v6)) - (((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 | v6 - (char *)v5 + 2 * (v5 & ~v6)) - ((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 & v6 - (char *)v5 + 2 * (v5 & ~v6)) | -((v6 ^ -v4) + (v4 & ~v6 | v6 & -v4) * 2 ^ v6 - (char *)v5 + 2 * (v5 & ~v6)))) * 2)
        return a0;
    _memmove();
    return a0;
}
