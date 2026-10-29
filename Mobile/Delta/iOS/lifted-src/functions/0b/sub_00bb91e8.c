/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb91e8..0xbb92ac (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb91e8_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_bb91e8_0;

extern long long g_ef9450;

unsigned long long sub_bb91e8(st_bb91e8_0 *a0, long long a1, long long a2)
{
    long long v2;  // x20
    long long ptr;  // x23
    unsigned long long dst;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if ((unsigned long long)v2 >= (unsigned long long)a1)
    {
        if (v2 == a0->field_0)
            sub_c6c42c(a0);
        ptr = a0->field_8 + 264 * a1;
        if ((unsigned long long)v2 > (unsigned long long)a1)
            _memmove(ptr + 264, ptr, (v2 - a1) * 264);
        dst = _memcpy(ptr, a2, 264);
        a0->field_10 = v2 + 1;
        return dst;
    }
    sub_c6bb08(a1, v2, &g_ef9450);
    __debugbreak();
}
