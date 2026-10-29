/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6467c..0x647d0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6467c_0 {
    char field_0;
} st_6467c_0;


void* sub_6467c(void* a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long v4;  // x22
    unsigned long long v5;  // x0
    st_6467c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_6467c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(a0 + 16, 0, 48);
    sub_640b8();
    if ((char)a0[400] == 1 && (long long)a0[64])
        operatordelete[]((long long)a0[64]);
    if ((char)a0[401] == 1 && (long long)a0[104])
        operatordelete[]((long long)a0[104]);
    *(unsigned long long *)&a0[96] = a2;
    if (a2 >= 9)
    {
        v4 = (char)a0[402];
        if (a1 && (unsigned int)v4)
        {
            *(unsigned long long *)&a0[64] = a1;
            *(char *)&a0[400] = 0;
        }
        else
        {
            *(long long *)&a0[64] = operatornew[](a2);
            *(char *)&a0[400] = 1;
            if (!(v4 & 1))
            {
                if (8 < (long long)a2)
                    v5 = a2;
                else
                    v5 = 8;
                *(unsigned long long *)&a0[112] = v5;
                if (!a1)
                {
                    *(long long *)&a0[104] = operatornew[](v5);
                    *(char *)&a0[401] = 1;
                    return a0;
                }
                else if ((long long)a2 < 9)
                {
                    *(long long *)&a0[104] = operatornew[](v5);
                    *(char *)&a0[401] = 1;
                    return a0;
                }
                else
                {
                    *(unsigned long long *)&a0[104] = a1;
                    *(char *)&a0[401] = 0;
                    return a0;
                }
            }
        }
    }
    else
    {
        *(void* *)&a0[64] = a0 + 88;
        *(unsigned long long *)&a0[96] = 8;
        *(char *)&a0[400] = 0;
        if (!((char)a0[402] & 1))
        {
            *(unsigned long long *)&a0[112] = 8;
            *(long long *)&a0[104] = operatornew[](8);
            *(char *)&a0[401] = 1;
            return a0;
        }
    }
    *(char *)&a0[401] = 0;
    *(unsigned long long *)&a0[104] = 0;
    *(unsigned long long *)&a0[112] = 0;
    return a0;
}
