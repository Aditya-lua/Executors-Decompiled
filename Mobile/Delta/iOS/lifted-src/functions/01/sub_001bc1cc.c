/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc1cc..0x1bc2c4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc1cc_0 {
    char padding_0[632];
    char field_278;
} st_1bc1cc_0;

extern char g_e70290;

unsigned long long sub_1bc1cc(unsigned long a0, long long a1, st_1bc1cc_0 *a2, long long a3)
{
    unsigned long long *v5;  // x1
    unsigned long long v6;  // x0
    unsigned long v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x40]
    char v2;  // [bp-0x31]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a2->field_278 == 1)
    {
        v1 = 0;
        v5 = operatornew(8);
        *v5 = &g_e70290;
        v0 = 0;
        sub_63c08(&v1, v5);
        sub_e6bb4(&v0, 0);
        v6 = sub_1b12f4(a1, &a2->padding_0[600], &v2, v1, a3);
        sub_63c08(&v1, 0);
        return v6;
    }
}
