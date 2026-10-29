/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaded9c..0xadef10 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

unsigned long long sub_aded9c(long long a0, void* a1, unsigned long long a2)
{
    unsigned long long v7;  // x0
    unsigned int v8;  // w8
    unsigned long long v9;  // x8
    unsigned long long v10;  // x9
    unsigned long long v11;  // 4111
    unsigned long long v12;  // x8
    unsigned long v13;  // x22
    unsigned long v14;  // x0
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    char v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (*(int *)a1)
    {
        sub_a36c8c();
        v7 = sub_9c1674(&v4, a1);
        sub_a36cd4(v7, a1);
        v8 = (int)a1[4];
        if ((unsigned int)v7)
        {
            if (v8 != 258)
                v9 = v4;
            else
                v9 = -v4;
            v10 = &g_c7c2eb;
            v11 = arm64g_calculate_condition(3, v8, 258, 0);
            if (v11 & 1)
                v10 = "-";
            v2 = v10;
            v3 = v9;
            v0 = v10;
            v1 = v9;
        }
        else
        {
            if (v8 == 258)
                v12 = " (Negative)";
            else
                v12 = &g_c7c2eb;
            v0 = a2;
            v1 = &g_c7c2eb;
            v2 = v12;
            if ((int)sub_9d524c() < 1)
                return 0xffffffff;
            if (*(int *)a1 > 1)
            {
                v13 = 0;
                do
                {
                    v0 = *(char *)((long long)a1[8] + v13);
                    v1 = 58;
                    if ((int)sub_9d524c(a0, "%02x%c") < 1)
                        return 0xffffffff;
                } while ((v13 += 1, (long long)v13 < *(int *)a1 - 1));
            }
            else
            {
                v13 = 0;
            }
            v0 = *(char *)((long long)a1[8] + v13);
        }
        if ((int)sub_9d524c(a0) < 1)
            return 0xffffffff;
        return 0;
    }
    else
    {
        if (1 <= (int)sub_9d4888(a0, " (Empty)"))
            v14 = 0;
        else
            v14 = 0xffffffff;
        return v14;
    }
}
