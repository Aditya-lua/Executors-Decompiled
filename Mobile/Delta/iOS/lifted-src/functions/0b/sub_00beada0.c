/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeada0..0xbeaec8 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beada0_0 {
    char field_0;
} st_beada0_0;

extern long long g_e080f3;
extern long long g_efa830;
extern long long g_efa848;

st_beada0_0 ** sub_beada0(char *a0, char *a1, char *a2, char *a3, st_beada0_0 **a4)
{
    char *v2;  // x8
    char *v3;  // x9
    char *v4;  // x3
    char *v5;  // x9
    char *v6;  // x10
    char *v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        sub_c73c80("assertion failed: !buf.is_empty()", 33, &g_efa830);
    }
    else if (*a0 > 48)
    {
        *(unsigned short *)a4 = 2;
        if (a2 >= 1)
        {
            v2 = a2;
            a4[1] = a0;
            v3 = a1 - v2;
            if (a1 > v2)
            {
                a4[2] = v2;
                *(unsigned short *)&a4[3] = 2;
                a4[4] = ".{size limit reached}`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899";
                a4[5] = 1;
                *(unsigned short *)&a4[6] = 2;
                a4[7] = a0 + v2;
                a4[8] = v3;
                v4 = a3 - v3;
                if (a3 <= v3)
                    return a4;
            }
            else
            {
                a4[2] = a1;
                *(unsigned short *)&a4[3] = 0;
                a4[4] = v2 - a1;
                if (!a3)
                    return a4;
                *(unsigned short *)&a4[6] = 2;
                a4[7] = ".{size limit reached}`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899";
                a4[8] = 1;
                v4 = a3;
            }
        }
        else
        {
            a4[1] = "0.0e0assertion failed: buf.len() >= maxlen {\n,\n(\nassertion failed: other > 0assertion failed: noborrowassertion failed: digits < 400000000000000000000000000000000000000000000000000000000000000000[...]called `Option::unwrap()` on a `None` valuepanic in a destructor during cleanup==panic in a function that cannot unwind";
            a4[2] = 2;
            v5 = a2;
            v6 = -v5;
            *(unsigned short *)&a4[3] = 0;
            a4[4] = v6;
            *(unsigned short *)&a4[6] = 2;
            a4[7] = a0;
            a4[8] = a1;
            v7 = a3 - a1;
            if (a3 <= a1)
            {
                return a4;
            }
            else if (v7 > v6)
            {
                v4 = v7 + v5;
            }
            else
            {
                return a4;
            }
        }
        *(unsigned short *)&a4[9] = 0;
        a4[10] = v4;
        return a4;
    }
    sub_c73c80(&g_e080f3, 31, &g_efa848);
}
