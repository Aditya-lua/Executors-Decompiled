/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0ea30..0xb0eb04 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0ea30_1 {
    char padding_0[64];
    unsigned long long field_40;
} st_b0ea30_1;

typedef struct st_b0ea30_0 {
    char padding_0[112];
    unsigned long long field_70;
} st_b0ea30_0;


int sub_b0ea30(st_b0ea30_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    unsigned long v3;  // x8
    unsigned long long v4;  // x21
    st_b0ea30_1 *v5;  // x22
    unsigned long long v6;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a0->field_70;
    v4 = 64 - v3;
    if (a2 > v4)
    {
        if (v3)
        {
            v5 = &a0->padding_0[48];
            _memcpy(&v5->padding_0[v3]);
            sub_b0eb04(a0, v5, 64);
            a0->field_70 = 0;
            v2 = a2 - v4;
        }
        if (v2 >= 65)
        {
            if (!(v2 & 63))
                v6 = 64;
            else
                v6 = v2 & 63;
            sub_b0eb04();
            v3 = a0->field_70;
            v2 = v6;
        }
        else
        {
            v3 = 0;
        }
    }
    _memcpy(&a0->padding_0[v3 + 48]);
    a0->field_70 = a0->field_70 + v2;
    return 1;
}
