/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5f14c..0xb5f97c (2096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_b5f14c(unsigned long long a0, char *a1, char *a2)
{
    char *v7;  // x8
    char *v8;  // x8
    char *v0;  // [bp-0x2c]
    unsigned long node;  // [bp-0x28], Other Possible Types: unsigned long long
    char *iter2;  // [bp-0x20]
    char *v3;  // [bp-0x20]
    char *iter1;  // [bp-0x18]
    unsigned long iter;  // [bp-0x10], Other Possible Types: unsigned long long
    char *v6;  // [bp-0x8]

    iter = a0;
    iter1 = a1;
    iter2 = a2;
    node = iter >> 16 & 0xffff;
    if (iter2 == 1)
    {
        iter += *iter1;
        if (0xfff1 <= iter)
            iter -= 0xfff1;
        node += iter;
        if (0xfff1 <= node)
            node -= 0xfff1;
        v6 = iter | node * 0x10000;
        return v6;
    }
    else if (!iter1)
    {
        v6 = 1;
        return v6;
    }
    else if (iter2 < 16)
    {
        while (1)
        {
            v3 = iter2 - 1;
            if (!iter2)
                break;
            v7 = iter1;
            iter1 = v7 + 1;
            iter += *v7;
            node += iter;
            iter2 = v3;
        }
        if (0xfff1 <= iter)
            iter -= 0xfff1;
        node -= 0xfff1 * node / 0xfff1;
        v6 = iter | node * 0x10000;
        return v6;
    }
    else
    {
        for (iter = (unsigned short)iter; 5552 <= iter2; node -= 0xfff1 * node / 0xfff1)
        {
            iter2 -= 5552;
            v0 = (char *)347;
            do
            {
                iter += *iter1;
                node += iter;
                iter += iter1[1];
                node += iter;
                iter += iter1[2];
                node += iter;
                iter += iter1[3];
                node += iter;
                iter += iter1[4];
                node += iter;
                iter += iter1[5];
                node += iter;
                iter += iter1[6];
                node += iter;
                iter += iter1[7];
                node += iter;
                iter += iter1[8];
                node += iter;
                iter += iter1[9];
                node += iter;
                iter += iter1[10];
                node += iter;
                iter += iter1[11];
                node += iter;
                iter += iter1[12];
                node += iter;
                iter += iter1[13];
                node += iter;
                iter += iter1[14];
                node += iter;
                iter += iter1[15];
                node += iter;
                iter1 += 16;
            } while ((v0 -= 1, v0));
            iter -= 0xfff1 * iter / 0xfff1;
        }
        if (iter2)
        {
            for (; 16 <= iter2; iter1 += 16)
            {
                iter2 -= 16;
                iter += *iter1;
                node += iter;
                iter += iter1[1];
                node += iter;
                iter += iter1[2];
                node += iter;
                iter += iter1[3];
                node += iter;
                iter += iter1[4];
                node += iter;
                iter += iter1[5];
                node += iter;
                iter += iter1[6];
                node += iter;
                iter += iter1[7];
                node += iter;
                iter += iter1[8];
                node += iter;
                iter += iter1[9];
                node += iter;
                iter += iter1[10];
                node += iter;
                iter += iter1[11];
                node += iter;
                iter += iter1[12];
                node += iter;
                iter += iter1[13];
                node += iter;
                iter += iter1[14];
                node += iter;
                iter += iter1[15];
                node += iter;
            }
            while (1)
            {
                iter2 -= 1;
                if (!iter2)
                    break;
                v8 = iter1;
                iter1 = v8 + 1;
                iter += *v8;
                node += iter;
            }
            iter -= 0xfff1 * iter / 0xfff1;
            node -= 0xfff1 * node / 0xfff1;
        }
        v6 = iter | node * 0x10000;
        return v6;
    }
}
